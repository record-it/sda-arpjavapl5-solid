package sda.arpjavapl5.solid.dip;

import sda.arpjavapl5.solid.srp.User;

public class UserReport extends Report{
    private final Printer printer;
    private final User user;

    public UserReport(Printer printer, User user) {
        this.printer = printer;
        this.user = user;
    }

    @Override
    public void print() {
        printer.configure(300);
        printer.print(user.getFirstName() +" " + user.getLastName());
    }
}
