

public class PostRunClass {
	public static void main(String[] args) {
		Post post = new Post();
		post.insertPost();


		System.out.println("" + post.title +"\n"+ post.description + ", " + post.createDate);
	}
}
