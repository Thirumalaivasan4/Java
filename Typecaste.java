public class Typecaste{
public static void main(String args[]){
/*long a=2147483647;
byte b;
b=(byte)a;
System.out.println(b);
byte d=5;
int c;
c=d;
System.out.println(c);
int i=0;
for(i=0;i<=200;i++)
System.out.println("Character:"+(char)i+"\t"+"ASCII Value:"+i);*/
int n=31,flag=0,i=1;
while(i<=n)
{
    if(n%i==0){
          flag++;
    }

    i++;

}
if(flag==2){
System.out.println("prime");
}
else{
System.out.println("`not prime");
}
}
}