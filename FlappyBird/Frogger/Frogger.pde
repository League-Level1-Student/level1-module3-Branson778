int frogX = 400;
int frogY = 550;
int frogHop = 15;
car car1 = new car(400,300,10);
car car2 = new car(300,200,10);
car car3 = new car(200,100,10);
car car4 = new car(500,400,10);
car car5 = new car(600,500,10);
car car6 = new car(700,600,10);
car car7 = new car(800,700,10);
car car8 = new car(100,0,10);
void setup(){
  size(800, 600);
}
void draw(){
  background(0,0,0);
fill(#31B714);
rect(frogX, frogY, 47, 46);
xboundaries();
yboundaries();
car1.display();
car2.display();
car3.display();
car4.display();
car5.display();
car6.display();
car7.display();
car8.display();
car1.mover();
car2.mover();
car3.mover();
car4.movel();
car5.movel();
car6.mover();
car7.mover();
car8.mover();
}
public class car{
  int carX = 0;
  int carY = 0;
  int carSpeed = 10;
  public car(int carX, int carY, int carSpeed){
    this.carX=carX;
    this.carY=carY;
    this.carSpeed=carSpeed;
  }
      void display(){
  
    fill(255,255,255);
    rect(carX , carY,  47, 50);
  
  }
  void movel(){
    carX-=carSpeed;
    if(carX<=0){
      carX=800;
    }
    if(carX>=frogX-40 && carX<=frogX+40 && carY>=frogY-40 && carY<=frogY+40){
     fill(255,0,0);
      text("DEAD",150,300);
      textSize(87);
  }
//      if(carY>=frogY-11 && carY<=frogY+11){
 //    fill(255,0,0);
  //      text("DEAD",400,300);
   //     textSize(87);
//  }
  else{
    text("LIVE",400,300);
    textSize(87);
  }
}
 void mover(){
    carX+=carSpeed;
    if(carX>=800){
      carX=0;
    }
   if(carX>=frogX-40 && carX<=frogX+40 && carY>=frogY-40 && carY<=frogY+40){
     fill(255,0,0);
      text("DEAD",150,300);
      textSize(87);
  }
//      if(carY>=frogY-11 && carY<=frogY+11){
 //    fill(255,0,0);
  //      text("DEAD",400,300);
   //     textSize(87);
//  }
  else{
    text("LIVE",400,300);
    textSize(87);
  }
}
}
void keyPressed()
{
    if(key == CODED){
        if(keyCode == UP)
        {
            frogY-=frogHop;
        }
        else if(keyCode == DOWN)
        {
            frogY+=frogHop;
        }
        else if(keyCode == RIGHT)
        {
            frogX+=frogHop;
        }
        else if(keyCode == LEFT)
        {
          frogX-=frogHop;
        }
    }
}
void xboundaries(){
  if(frogX<=0){
    frogX=800;
  }
  else if(frogX>=800){
    frogX=0;
  }
}
void yboundaries(){
  if(frogY<=0){
    frogY=600;
  }
  else if(frogY>=600){
    frogY=0;
  }
}
