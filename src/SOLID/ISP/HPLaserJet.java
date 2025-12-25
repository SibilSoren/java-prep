package SOLID.ISP;

public class HPLaserJet implements PrintScanContent,IFaxContent{
    @Override
    public boolean ScanContent(String content) {
        return false;
    }

    @Override
    public boolean PrintContent(String content) {
        return false;
    }

    @Override
    public boolean PhotoCopyContent(String content) {
        return false;
    }

    @Override
    public boolean FaxContent(String content) {
        return false;
    }
}
