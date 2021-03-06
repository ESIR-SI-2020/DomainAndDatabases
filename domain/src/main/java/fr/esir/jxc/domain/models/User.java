package fr.esir.jxc.domain.models;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document(indexName = "pocket", type = "user")
public class User {

    @Id
    @NonNull
    private String email;
    @NonNull
    private String username;
    @NonNull
    private String password;

    @NonNull
    @Field(type = FieldType.Object)
    private Address address;
    private List<String> friends;

}

