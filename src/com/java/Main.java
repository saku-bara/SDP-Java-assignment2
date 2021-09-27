package com.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorry, all sits are sold out!\n"
                +"Please subscribe to get an update on available sits");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        TicketSaleSite ticketon = new TicketSaleSite();

        User Jungkook = new User("jk97@gmail.com");
        ticketon.userJoinWaitlist(Jungkook);

        ticketon.updateSits(4);
        User Taehyung = new User("TaeTae95@yandex.ru");
        ticketon.userJoinWaitlist(Taehyung);

        ticketon.updateSits(15);

        ticketon.userUnregister(Taehyung);

        ticketon.removeSits(4);

    }
}
