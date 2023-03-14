public class Area_of_Circle {
    public  float area(float a)
    {
        float result= (float) (Math.PI*(a*a));

        return  result;
    }
    public  float circum(float a)
    {

        float circum=2*(float) (Math.PI)*(a);
        return  circum;
    }
      public boolean nameContains(String name,char c)
      {
              if(name.contains(Character.toString(c)))
              {
                  return  true;
              }

          return  false;
      }
    public static void main(String[] args) {
        Area_of_Circle ar=new Area_of_Circle();
        float m=ar.area(23);
        float n=ar.circum(23);
        System.out.println("area :"+m+"\n"+"circum:"+n);
        System.out.println(ar.nameContains("Mubashir",'b'));
        String name="Shahid";
        boolean per=false;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='d')
            {
                per=true;
                break;
            }
        }
        System.out.println(per);

        System.out.println(10/3);
    }
}
