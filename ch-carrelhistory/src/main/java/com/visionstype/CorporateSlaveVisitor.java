package com.visionstype;

import com.visionstype.CorperateSlaveImpl.Programmer;

public interface CorporateSlaveVisitor {

    void visited(Programmer programmer);

    void visited();

}
