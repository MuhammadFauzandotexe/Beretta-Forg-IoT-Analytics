package Controller.Lama;
import javax.transaction.Transactional;

public class ConsumerSensor1 {
    @Transactional
    public static void main(String[] args) {
//        Properties props = new Properties();
//        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
//        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG,"test");
//        props.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,"true");
//        props.setProperty("auto.commit.interval.ms","1000");
//        props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer");
//        props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer");
//        KafkaConsumer<String,String> consumer = new KafkaConsumer<>(props);
//        consumer.subscribe(Arrays.asList("sensor"));
//        while (true){
//            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
//            for (ConsumerRecord<String,String> record:records){
//                String data = record.value();
//                System.err.println(data);
//                Gson gson = new Gson();
//                sensor mysensor = null;
//                mysensor = gson.fromJson(data, sensor.class);
//                Sensor sensor = new Sensor();
//                sensor.Sensor1 = mysensor.sensor1.toString();
//                sensor.Sensor2 = mysensor.sensor2.toString();
//                sensor.Sensor3 = mysensor.sensor3.toString();
//                sensor.Sensor4 = mysensor.sensor4.toString();
//                sensor.Sensor5 = mysensor.sensor5.toString();
//                sensor.persist();
//                if(sensor.isPersistent()){
//                    System.err.println("done");
//                }
////
////                System.err.print(mysensor.sensor1+" " +
////                        " "+mysensor.sensor2+
////                        " "+mysensor.sensor3+
////                        " "+mysensor.sensor4+
////                        " "+mysensor.sensor5);
//            }
//        }
    }
}
class sensor{
    String sensor1;
    String sensor2;
    String sensor3;
    String sensor4;
    String sensor5;
    public sensor(){
        this.sensor1 = "";
        this.sensor2 = "";
        this.sensor3 = "";
        this.sensor4 = "";
        this.sensor5 = "";

    }
}
