package dev.scheincomp.jsp.five.board;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {
    int b_no;
    String b_title;
    String b_id;
    Date b_date;
    int b_cnt;
}
