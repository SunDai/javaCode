package rmi;



import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xh on 2015/11/19.
 */
public interface Compute extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}
