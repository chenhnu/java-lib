package pt.log;

public class Log {
    /**
     * 使用 StringBuilder 来提高效率
     * @param msg debug信息
     */
    public static void debug(String... msg){
        StringBuilder debugInfo=new StringBuilder();
        for(String ms:msg){
            debugInfo.append(ms);
        }
        System.out.println(debugInfo);
    }

    /**
     * @param msg  error信息
     */
    public static void error(String... msg){
        StringBuilder debugInfo=new StringBuilder();
        for(String ms:msg){
            debugInfo.append(ms);
        }
        System.err.println(debugInfo);
    }
}
