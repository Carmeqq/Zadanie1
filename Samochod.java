public class Samochod{
String marka;
String model;
int rokProdukcji;

public Samochody(String marka, String model , int rokProdukcji){
this.marka = marka;
this.model = model;
this.rokProdukcji = rokProdukcji;
}
public void wyswietlInfo(){
System.out.println("marka:" + marka + "model: " + model + "rokProdukcji" + rokProdukcji)
}
}
