 int ran = (int) random(0,250);
  int ran2 = (int) random(284,500);
 int BirdX=254;
  int BirdY=282;
  int velocity = 17;
  int gravity = 3;
  int pipeX = 500;
  int pipeY = 0;
  int pipeW = 42;
  int pipeH = ran;
void setup(){
  size(500, 565);
}
void draw(){
  background(#25F5E5);
fill(252, 241, 15);
stroke(#000000);
ellipse(BirdX, BirdY, 33, 29);
fill(#38932C);
rect(pipeX, pipeY, pipeW, pipeH);
BirdY+=gravity;
pipeX-=4;
if(mousePressed){
  BirdY-=velocity;
}
if(pipeX<=0){
  pipeX=500;
  ran= (int) random(0,250);
  pipeH = ran;
}
}
