package org.javapages.restapi.fileuploadapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {

	public static void main(String[] args) throws IOException {
		Client client = ClientBuilder.newClient();
		Builder builder = client.target("http://localhost:8080/fileuploadapp/webapi/upload")
				.request(MediaType.APPLICATION_FORM_URLENCODED);

		FileUploadBean fileUploadBean = new FileUploadBean();
		fileUploadBean.setClientId("clxxx");
		fileUploadBean.setDirName("C:\\Apps");

		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bs);
		oos.writeObject(fileUploadBean);
		byte[] byteArray = bs.toByteArray();
		Response response = builder.post(Entity.text(byteArray));
		Object entity = response.getEntity();
		System.out.println(entity);
	}

}
