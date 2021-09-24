//놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
//즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를
//return 하도록 solution 함수를 완성하세요.
//단, 금액이 부족하지 않으면 0을 return 하세요.

public class level1_weekly1 {
  static public long solution(int price, int money, int count) {
      long tmp = (long)price*count*(count+1)/2 - money; //int시 오류
      return tmp<0 ? 0 : tmp;
  }
  
  public static void main(String[] args){
    System.out.println(solution(3,20,4));
    //입력값 〉	3, 20, 4 기댓값 〉	10
  }
}
