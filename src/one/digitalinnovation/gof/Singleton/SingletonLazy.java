package one.digitalinnovation.gof.Singleton;

/**
 *
 * singleton "preguiçoso"
 * @author gidLamim
 *
 * Singleton Java :
 *      Singleton is a creational design pattern, which ensures that only
 *      one object of its kind exists and provides a single point of access
 *      to it for any other code. Singleton has almost the same pros and cons
 *      as global variables. Although they're super-handy, they break the
 *      modularity of your code.
 *
 */

public class SingletonLazy {


        private static SingletonLazy instancia;

        private SingletonLazy() {
            super();
        }

        public static SingletonLazy getInstancia() {
            if (instancia == null) {
                instancia = new SingletonLazy();
            }
            return instancia;
        }


}
