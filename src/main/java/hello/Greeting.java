package hello;


import java.util.List;

public class Greeting {

	private final long id;
	private final String content;
	private List<String> strings;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
		strings.add("strings is null");
		strings.add("strings is null");
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
