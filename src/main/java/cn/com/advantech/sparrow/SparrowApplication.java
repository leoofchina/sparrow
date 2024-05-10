package cn.com.advantech.sparrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SparrowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparrowApplication.class, args);

        System.out.println("                   |\"|           !!!         |\n" +
                "     ***          _|_|_       `  _ _  '      |.===.     \n" +
                "    (o o)         (o o)      -  (OXO)  -     {}o o{}    \n" +
                "ooO--(_)--Ooo-ooO--(_)--Ooo-ooO--(_)--Ooo-ooO--(_)--Ooo-\n" +
                " _____              _             _____        ______  \n" +
                "(____ \\            (_)           / ___ \\      (_____ \\ \n" +
                " _   \\ \\ ____ _   _ _  ____ ____| |   | |____   ____) )\n" +
                "| |   | / _  ) | | | |/ ___) _  ) |   | |  _ \\ /_____/ \n" +
                "| |__/ ( (/ / \\ V /| ( (__( (/ /| |___| | | | |_______ \n" +
                "|_____/ \\____) \\_/ |_|\\____)____)\\_____/|_| |_(_______)\n" +
                "\t\t*\\(^_^)/*  Sparrow Started   ^_^o");
    }
}
