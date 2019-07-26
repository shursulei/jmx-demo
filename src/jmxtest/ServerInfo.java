package jmxtest;

public class ServerInfo implements ServerInfoMBean{
	public int getExecutedSqlCmdCount() {
        return 100;
    }

    public void printString(String fromJConsole) {
        System.out.println(fromJConsole);
    }
}
