int frogX = 400;
int frogY = 550;
int frogHop = 15;
void setup(){
  size(800, 600);
}
void draw(){
  background(0,0,0);
fill(#31B714);
ellipse(frogX, frogY, 47, 46);
xboundaries();
yboundaries();
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
