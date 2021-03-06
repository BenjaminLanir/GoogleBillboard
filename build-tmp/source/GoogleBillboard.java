import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907632338298807531952510190115738341879307021540891499348841675092447614606680822648001684774118537423454424371075390777449920695517027618386062613313845830007520449338265602976067371132007093287091274437470472306969772093101416928368190255151086574637721112523897844250569536967707854499699679468644549059879316368892300987931277361782154249992295763514822082698951936680331825288693984964651058209392398294887933203625094431173012381970684161403970198376793206832823764648042953118023287825098194558153017567173613320698112509961818815930416903515988885193458072738667385894228792284998920868058257492796104841984443634632449684875602336248270419786232090021609902353043699418491463140934317381436405462531520961836908887070167683964243781405927145635490613031072085103837505101157477041718986106873969655212671546889570350354";  
String digits = e.substring(0,10);
double section = Double.parseDouble(digits);
String m = "999994";
public void setup()  
{            
     noLoop();
     for (int i = 2; i < e.length() - 10; i++)
     {
        digits = e.substring(i, 10 + i);
        section = Double.parseDouble(digits);
        //System.out.println(section);{
        digits = e.substring(i, 10 + i);
        if (is49(digits) == true)
        {
            System.out.println(section);
            System.out.println("this one works");
        }
     }
     for (int i = 2; i < e.length() - 10; i++)
     {
     	digits = e.substring(i, 10 + i);
     	section = Double.parseDouble(digits);
     	//System.out.println(section);{
        digits = e.substring(i, 10 + i);
     	if (isPrime(section) == true)
     	{
     		System.out.println(section);
     		System.out.println(isPrime(section));
            break;
     	}
     }
}  
public void draw()  
{   
	//not needed for this assignment
}  
public boolean isPrime(double dNum)  
{   
    //to be finished later
    for (int i = 2; i <= Math.sqrt(dNum) ; i++)
    {
    	if (dNum % i == 0)
    	{
    		return false;
    	}
    }
    return true;
} 
public boolean is49(String rNum)
{
	int t = 0;
    String sub = new String();
	for (int i = 0; i < rNum.length(); i++)
	{
        sub = rNum.substring(i, i+1);
		double z = Double.parseDouble(sub);
		t += z;
	}
    if (t == 49)
    {
        return true;
    }
    else
    {
        return false;
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
