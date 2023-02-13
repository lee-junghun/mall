package mall.domain;

import mall.domain.DeliveryStarted;
import mall.domain.DeleveryCanceled;
import mall.domain.DeleveryReturned;
import mall.domain.DeleveryCompleted;
import mall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long productId;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long productId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeleveryCanceled deleveryCanceled = new DeleveryCanceled(this);
        deleveryCanceled.publishAfterCommit();



        DeleveryReturned deleveryReturned = new DeleveryReturned(this);
        deleveryReturned.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        DeleveryCompleted deleveryCompleted = new DeleveryCompleted(this);
        deleveryCompleted.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }




    public static void deliveryStart(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }
    public static void deliveryCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
