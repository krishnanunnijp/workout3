public class panCardValidity {
    private String pancardno =new String();

    private String name=new String();

    public panCardValidity(String pancardno, String name) {
        this.pancardno = pancardno;
        this.name = name;
    }

    public void checkValid(){
        try
        {
            if(name.charAt(0)== pancardno.charAt(4))
            {
                System.out.println("First char in name "+name.charAt(0));

                System.out.println("fifth char in pan card "+ pancardno.charAt(4));

                System.out.println("Valid pan card no");
            }
            else {
                throw new InvalidPanException("invalid pan card number");
            }
        }
        catch (InvalidPanException e)
        {
            System.out.println(e);

        }
    }
}
