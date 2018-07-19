package baba.googleprotect;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;

public class JSSEProvider extends Provider {

    class C01891 implements PrivilegedAction<Void> {
        C01891() {
        }

        public Void run() {
            JSSEProvider.this.put("SSLContext.TLS", "org.apache.harmony.xnet.provider.jsse.SSLContextImpl");
            JSSEProvider.this.put("Alg.Alias.SSLContext.TLSv1", "TLS");
            JSSEProvider.this.put("KeyManagerFactory.X509", "org.apache.harmony.xnet.provider.jsse.KeyManagerFactoryImpl");
            JSSEProvider.this.put("TrustManagerFactory.X509", "org.apache.harmony.xnet.provider.jsse.TrustManagerFactoryImpl");
            return null;
        }
    }

    public JSSEProvider() {
        super("HarmonyJSSE", 1.0d, "Harmony JSSE Provider");
        AccessController.doPrivileged(new C01891());
    }
}
