package com.company;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {
	    PostIt post1 = new PostIt();
	    post1.backgroundColor = Color.ORANGE;
	    post1.textColor = Color.blue;
	    post1.text = "Idea 1";

        PostIt post2 = new PostIt();
        post2.backgroundColor = Color.pink;
        post2.textColor = Color.black;
        post2.text = "Awesome";

        PostIt post3 = new PostIt();
        post3.backgroundColor = Color.yellow;
        post3.textColor = Color.green;
        post3.text = "Superb!";
    }
}
