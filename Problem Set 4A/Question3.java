/**
 * AP Computer Science
 * Laila Wilcox
 * October 21th, 2024
 * Promblem Set 4A (Question 3) 
 */

import java.util.Scanner;

public class Question3 {
    public static void main (String[] args) {
        StdDraw.setScale(0, 1);
        

        OrderedPair VertexA = new OrderedPair(0, 1);
        OrderedPair VertexB = new OrderedPair(0.5, 0);
        OrderedPair VertexC = new OrderedPair(1, 1);

        StdDraw.point(VertexA.getX(), VertexA.getY());
        StdDraw.point(VertexB.getX(), VertexB.getY());
        StdDraw.point(VertexC.getX(), VertexC.getY());

        OrderedPair CurrentPoint = Midpoint(VertexA, VertexB);
        OrderedPair OldPoint = null;
        //for(int i = 0; i < 1000000; i++){
            while(CurrentPoint != OldPoint){
            OrderedPair NewVertex = null;
            int n = (int) (Math.random()*3) +1;
            if(n == 1){
                NewVertex = VertexA;
            } else if (n == 2){
                NewVertex = VertexB;
            } else {
                NewVertex = VertexC;
            } 
            if(NewVertex != null){
                OrderedPair NewPoint = Midpoint(CurrentPoint, NewVertex);
                StdDraw.point(NewPoint.getX(), NewPoint.getY());
                CurrentPoint = NewPoint; 
            }
        }
    }

    public static OrderedPair Midpoint(OrderedPair A, OrderedPair B){
        double answer1 = (A.x + B.x)/2.0;
        double answer2 = (A.y + B.y)/2.0;
        OrderedPair answer = new OrderedPair(answer1, answer2);
        return answer;
    }
    
    public String starOut(String str) {
  int starPosition = str.indexOf("*");
  String answer = str;
  
  while(starPosition >= 0){

  
    if(starPosition == 0){
      if(str.length() <= 2){
        answer = "";
        starPosition = -1;
      } else {
        if(answer.charAt(1) != '*'){
          answer = str.substring(2);
        }
      }
    }
  }
  return answer;
}

}

