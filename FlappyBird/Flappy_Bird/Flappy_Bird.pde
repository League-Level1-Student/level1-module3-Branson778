 int ran = (int) random(176,293);
  int ran2 = (int) random(343,437);
 int BirdX=254;
  int BirdY=282;
  int velocity = 17;
  int gravity = 3;
  int pipeX = 500;
  int pipeY = 0;
  int pipeAltY = ran2;
  int pipeW = 42;
  int pipeH = ran;
  int pipeAltH = 500;
  int scoreyeet = 0;
  boolean intersectsPipes() { 
         if (BirdY+15 < pipeH && BirdX+15 > pipeX && BirdX+15 < (pipeX+pipeW)){
            return true; }
        else if (BirdY+15>pipeAltY && BirdX+15 > pipeX && BirdX+15 < (pipeX+pipeW)) {
           return true; }
        else { return false; }
}
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
rect(pipeX, pipeAltY, pipeW, pipeAltH);
fill(#000000);
textSize(25);
text(scoreyeet, 250, 25);
BirdY+=gravity;
pipeX-=4;
if(mousePressed){
  BirdY-=velocity;
}
if(pipeX<=0){
  pipeX=500;
  ran= (int) random(176,293);
    ran2= (int) random(343,437);
  pipeH = ran;
  pipeAltH = ran2;
}
  if(intersectsPipes()==true){
 // System.exit(0); is an optional feature. Add // to undo it! :)
    System.exit(0);
    print("Death ");
}
else if(intersectsPipes()==false){
  scoreyeet+=1;

}}
