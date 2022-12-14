package com.example.randomtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RandomTestApplicationTests {

    @Test
    void contextLoads() {
        String[] result = new String[10];
        String[] result2 = new String[10];
        String[] result3 = new String[10];
        String[] result4 = new String[1000];

        result[0] = "일어나자마자";
        result[1] = "오후 2시에";
        result[2] = "점심 먹기 전에";
        result[3] = "매일 아침";
        result[4] = "30분 동안";
        result[5] = "2시간 안에";
        result[6] = "밥 먹을 때마다";
        result[7] = "퇴근하고";
        result[8] = "출근 10분 뒤에";
        result[9] = "자기 전에";

        result2[0] = "팔을 높이 들고";
        result2[1] = "부장님과";
        result2[2] = "신발 벗고";
        result2[3] = "반려동물과";
        result2[4] = "부모님과";
        result2[5] = "버스를 타고";
        result2[6] = "서점에서";
        result2[7] = "마트에서";
        result2[8] = "청소하고";
        result2[9] = "친구와";

        result3[0] = "스트레칭 하기";
        result3[1] = "전력질주 하기";
        result3[2] = "전화하기";
        result3[3] = "세수하기";
        result3[4] = "물 마시기";
        result3[5] = "조깅하기";
        result3[6] = "영화 보기";
        result3[7] = "책보기";
        result3[8] = "정기결제 해지하기";
        result3[9] = "편지쓰기";


        System.out.println(result);
        for (int i = 0; i< result.length; i++) {
            for (int j = 0; j<result2.length; j++) {
                for (int k = 0; k<result3.length; k++) {
                    System.out.println(result[i] +" "+ result2[j] +" "+ result[k]);

                }
            }
        }
    }

}
