package buoi7;

public class XeDap {
    public void run()
    {
        System.out.println("Xe dap chay bang suc nguoi");
    }    
}

class XeDapDien extends XeDap
{
    @Override
    public void run()
    {
        System.out.println("Xe dap dien chay bang dien");
    }
}

