package Service;

import nonService.Admin;
import nonService.Cafe;
import nonService.Quarantine;

public final class QuarantineStarted {

    Admin admin;

    public QuarantineStarted(Quarantine quarantine, Cafe cafe, Admin admin){
        quarantine.QuarantineHasStarted();
        this.admin = admin;
        cafe.setBills(3);
    }


    @Override
    public String toString() {
        if (admin.getIsInfested())
            return "Cafe is closed for Quarantine because Admin had Virus";

        return "Cafe working in Quarantine mode\n\n";
    }
}
