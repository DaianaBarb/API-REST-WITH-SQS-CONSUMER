package com.example.rest.config;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.sqs.AmazonSQSAsync;
//import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;


import java.net.URI;

@Configuration
public class AWSConfig {

    @Bean
    public SqsAsyncClient sqsAsyncClient() {
        return SqsAsyncClient.builder()
                .region(Region.US_EAST_1).credentialsProvider(StaticCredentialsProvider.create(
                        AwsBasicCredentials.create("test", "test"))).endpointOverride(URI.create("http://localhost:4566")).build();

    }
//    @Bean
//    public AmazonSQSAsync amazonSQSAsync() {
//        return AmazonSQSAsyncClientBuilder.standard()
//                .withEndpointConfiguration(
//                        new com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration(
//                                "http://localhost:4566", // URL do Localstack
//                                "us-east-1" // Região
//                        )
//                )
//                .withCredentials(
//                        new AWSStaticCredentialsProvider(
//                                new BasicAWSCredentials("test", "test")
//
//                        )
//                )
//                .build();
//    }

}



//@Configuration
//public class AWSConfig {
//
//
//    @Bean
//    public SqsAsyncClient sqsAsyncClient() {
//        return SqsAsyncClient.builder()
//                .region(Region.US_EAST_1).credentialsProvider(StaticCredentialsProvider.create(
//                        AwsBasicCredentials.create("fake", "fake"))).endpointOverride(URI.create("http://localhost:4566")).build();
//    }

//    @Bean
//    public AmazonSQSAsync amazonSQSAsync() {
//        return AmazonSQSAsyncClientBuilder.standard().withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(
//                        "http://localhost:4566",
//                        "us-east-1"
//                ))
//                .withCredentials(new AWSStaticCredentialsProvider(
//                        new BasicAWSCredentials("fake", "fake")
//                ))
//                .build();
//    }
//}