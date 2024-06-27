package exception.ex1;



public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가


        String connectResult = client.connect();
        //결과가 성공이 아니다 -> 오류다.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);

        }else {//connect에가서 오류가 없는 경우에만 send를 호출
            String sendResult = client.send(data);
            if (isError("succes")) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
          }

        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
