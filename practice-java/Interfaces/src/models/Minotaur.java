package models;

public class Minotaur extends Enemy{
    public void fight(){
        attack((int endX,int endY)->{
            int diffX = endX - this.getPosX();
            int diffY = endY - this.getPosY();

            //Para calcular la distancia saco la hipotenusa
            return (diffX*diffX)+(diffY*diffY);
        });
    };
    public void attack(CalculateDistance calculateDistance){
      int distance = calculateDistance.calculate(this.getPosX() +10,this.getPosY());
      if(distance >20){
          System.out.println("Un Ataque");
      }
      else{
          System.out.println("Otro Ataque");
      }
    };
}
