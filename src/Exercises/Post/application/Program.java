package Exercises.Post.application;

import Exercises.Post.entities.Comments;
import Exercises.Post.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Content: ");
        String content = sc.nextLine();

        System.out.print("Likes: ");
        int likes = sc.nextInt();

        LocalDateTime d01 = LocalDateTime.now();
        Post post = new Post(title, content, likes);

        System.out.println(post.getTitle());
        System.out.println(post.getLikes() + " Likes - " + d01.format(fmt01));
        System.out.println(post.getContent());

        String i = "y" ;
        sc.nextLine();
        do {
            System.out.println("Comment: ");
            String commentary = sc.nextLine();
            Comments comments = new Comments(commentary);
            System.out.println(comments.getComments());
            System.out.print("Comment again? (y/n): ");
            i = sc.nextLine();
        }while (!Objects.equals(i, "n"));




    sc.close();
    }



}
