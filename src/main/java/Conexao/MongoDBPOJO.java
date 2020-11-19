package Conexao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class MongoDBPOJO {

        private CodecRegistry codecRegistry;
        private  MongoDatabase database;
        private com.mongodb.client.MongoClient cliente;

        public MongoDBPOJO(){
            codecRegistry = org.bson.codecs.configuration.CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), org.bson.codecs.configuration.CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
            cliente = MongoClients.create(
                    "mongodb+srv://EustakioJr:3235@cluster0.inh8v.mongodb.net/ProjetoMongo?retryWrites=true&w=majority");
            database = cliente.getDatabase("ProjetoMongo");

        }

        public MongoCollection getCollection(String nome, Class classe){
            return database.getCollection(nome, classe);
        }

    }
