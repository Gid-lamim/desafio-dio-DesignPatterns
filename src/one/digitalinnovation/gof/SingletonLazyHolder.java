package one.digitalinnovation.gof;

/**
 *
 * singleton "preguiçoso"
 * @author: gidLamim
 *
 *
 * @see <a href="https://stackoverflow.com/a/24018148"> link </a>
 * @author gid.lamim
 *
 * Singleton Java :
 *      Singleton is a creational design pattern, which ensures that only
 *      one object of its kind exists and provides a single point of access
 *      to it for any other code. Singleton has almost the same pros and cons
 *      as global variables. Although they're super-handy, they break the
 *      modularity of your code.
 *
 */

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder intancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.intancia;
    }
}
