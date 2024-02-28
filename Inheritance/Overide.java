import java.util.Scanner;
class RateOfInterest {
    protected double rate;

    public RateOfInterest(double rate) {
        this.rate = rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
class RBI {
    protected RateOfInterest bankROI;

    public RBI(double rate) {
        this.bankROI = new RateOfInterest(rate);
    }

    public void setBankRateOfInterest(double rate) {
        bankROI.setRate(rate);
    }

    public double getBankRateOfInterest() {
        return bankROI.getRate();
    }
}
class HDFC extends RBI {
    private RateOfInterest hdfcROI;

    public HDFC(double rate, double hdfcRate) {
        super(rate);
        this.hdfcROI = new RateOfInterest(hdfcRate);
    }

    public void setHDFCRateOfInterest(double rate) {
        hdfcROI.setRate(rate);
    }

    public double getHDFCRateOfInterest() {
        return hdfcROI.getRate();
    }
}

class SBI extends RBI {
    private RateOfInterest sbiROI;

    public SBI(double rate, double sbiRate) {
        super(rate);
        this.sbiROI = new RateOfInterest(sbiRate);
    }

    public void setSBIRateOfInterest(double rate) {
        sbiROI.setRate(rate);
    }

    public double getSBIRateOfInterest() {
        return sbiROI.getRate();
    }
}

class PNB extends RBI {
    private RateOfInterest pnbROI;

    public PNB(double rate, double pnbRate) {
        super(rate);
        this.pnbROI = new RateOfInterest(pnbRate);
    }

    public void setPNBRateOfInterest(double rate) {
        pnbROI.setRate(rate);
    }

    public double getPNBRateOfInterest() {
        return pnbROI.getRate();
    }
}

class ICICI extends RBI {
    private RateOfInterest iciciROI;

    public ICICI(double rate, double iciciRate) {
        super(rate);
        this.iciciROI = new RateOfInterest(iciciRate);
    }

    public void setICICIRateOfInterest(double rate) {
        iciciROI.setRate(rate);
    }

    public double getICICIRateOfInterest() {
        return iciciROI.getRate();
    }
}
public class Overide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Rate of Interest:");
        double userROI = scanner.nextDouble();
        RateOfInterest userRateOfInterest = new RateOfInterest(userROI);
        System.out.println("Your ROI is set to: " + userRateOfInterest.getRate());
        System.out.println("Select a bank (1 - HDFC, 2 - SBI, 3 - PNB, 4 - ICICI):");
        int choice = scanner.nextInt();

        System.out.println("Enter the Rate of Interest for the selected bank:");
        double bankROI = scanner.nextDouble();
        RBI bank = null;
        switch (choice) {
            case 1:
                bank = new HDFC(userROI, bankROI);
                break;
            case 2:
                bank = new SBI(userROI, bankROI);
                break;
            case 3:
                bank = new PNB(userROI, bankROI);
                break;
            case 4:
                bank = new ICICI(userROI, bankROI);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.println("Your ROI: " + userRateOfInterest.getRate());
        System.out.println("Bank's ROI: " + bank.getBankRateOfInterest());
        if (bank instanceof HDFC) {
            HDFC hdfcBank = (HDFC) bank;
            System.out.println("HDFC Bank's ROI: " + hdfcBank.getHDFCRateOfInterest());
        } else if (bank instanceof SBI) {
            SBI sbiBank = (SBI) bank;
            System.out.println("SBI Bank's ROI: " + sbiBank.getSBIRateOfInterest());
        } else if (bank instanceof PNB) {
            PNB pnbBank = (PNB) bank;
            System.out.println("PNB Bank's ROI: " + pnbBank.getPNBRateOfInterest());
        } else if (bank instanceof ICICI) {
            ICICI iciciBank = (ICICI) bank;
            System.out.println("ICICI Bank's ROI: " + iciciBank.getICICIRateOfInterest());
        }

        scanner.close();
    }
}
