package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Outofstocked extends AbstractEvent {

    private Long id;

    public Outofstocked(){
        super();
    }
}
