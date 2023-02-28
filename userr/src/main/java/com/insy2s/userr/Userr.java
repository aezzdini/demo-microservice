package com.insy2s.userr;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Userr {
@Id
@SequenceGenerator(
        name = "userr_id_sequence",
        sequenceName = "userr_id_sequence")
@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "userr_id_sequence"          )
    private int  id;
    private String lastname;
    private String firstname;

}
