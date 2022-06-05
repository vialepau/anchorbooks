package com.edutecno.anchorbooks.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.edutecno.anchorbooks.model.Book;
import com.edutecno.anchorbooks.model.BookDetail;

public class ClientBooks {

	public static void main(String[] args) {
		// getBooks();
		//getNiceBooks();
		//getSomeBooks();
		//getBookDetail();
		getUnknownAuthors();
	}

	private static void getBooks() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response res = invocationBuilder.get();
		// System.out.println(res);

		List<Book> listaLibros = res.readEntity(new GenericType<List<Book>>() {
		});

		for (Book libro : listaLibros) {
			System.out.println(libro + "\n");
		}
	}

	private static void getNiceBooks() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response res = invocationBuilder.get();
		// System.out.println(res);

		List<Book> listaLibros = res.readEntity(new GenericType<List<Book>>() {
		});

		for (Book libro : listaLibros) {
			System.out.println(libro.getAuthor() + ": " + libro.getTitle());
		}
	}

	private static void getSomeBooks() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response res = invocationBuilder.get();
		// System.out.println(res);

		ArrayList<Book> listaLibros = (ArrayList<Book>) res.readEntity(new GenericType<List<Book>>() {
		});

		System.out.println("Libro número 3: "+listaLibros.get(3).getAuthor()
				+", "+listaLibros.get(3).getTitle()+", "+listaLibros.get(3).getCountry());
		System.out.println("Libro número 8: "+listaLibros.get(8).getAuthor()
				+", "+listaLibros.get(8).getTitle()+", "+listaLibros.get(8).getCountry());
	}

	private static void getBookDetail() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("bookDetail");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response res = invocationBuilder.get();
		// System.out.println(res);

		List<BookDetail> detalleLibros = res.readEntity(new GenericType<List<BookDetail>>() {
		});

		for (BookDetail detalles : detalleLibros) {
			System.out.println(detalles + "\n");
		}
	}

	private static void getUnknownAuthors() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response res = invocationBuilder.get();
		// System.out.println(res);

		ArrayList<Book> listaLibros = (ArrayList<Book>) res.readEntity(new GenericType<List<Book>>() {
		});

		for (Map.Entry<String, String> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();
			
		}
//		System.out.println("Libro número 3: "+listaLibros.get(3).getAuthor()
//				+", "+listaLibros.get(3).getTitle()+", "+listaLibros.get(3).getCountry());
//		System.out.println("Libro número 8: "+listaLibros.get(8).getAuthor()
//				+", "+listaLibros.get(8).getTitle()+", "+listaLibros.get(8).getCountry());
	}

	private static void deleteBooks() {

	}
}
