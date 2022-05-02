package chapters.chapter9.Interfaces.InterfaceChallange;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
