package com.example.hol;

//Download SQL cuz Mac + fix file paths cuz Mac

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
//Me of the future, I just want to say I am sorry and blame it on Java

//If I insert rank and delete everything with a rank below 3 it should be fixed, do it if I remember to check


public class Actor {

    String aname;
    int episodes;
    String image;

    SelectRecords app = new SelectRecords();


    public Actor(String name, int ep, String img) {

        this.aname = name;
        this.episodes = ep;
        this.image = img;

    }

    public String toString() //This + the things on top are the constructor to create the objects + this to be able to get the whole object
    {
        return aname + " " + episodes + " " + image;
    }

    public static void main(String[] args) { //Creating all the objects

        SelectRecords app = new SelectRecords();
        app.getVals();

        int[] res;

        res = SelectRecords.res;

        //System.out.println(Arrays.toString(res));

        int uscore = 0;
        int lives = 3;
        int round = 1;

        Actor[] chars;

        chars = new Actor[100];

        /*Actor nph*/
        chars[0] = new Actor(
                "Barney Stinson", 208,
                "https://imgs.search.brave.com/-6rNBOBfZz7CD6_94v8dESaLb6riLn4wN-5o1-TdRHs/rs:fit:900:900:1/g:ce/aHR0cHM6Ly95dDMu/Z2dwaHQuY29tL2Ev/QUFUWEFKeS1WRXpU/VEtlek9jZ2diMjdT/bXZlMEhmZjBqZjhu/cVd3Yz1zOTAwLWMt/ay1jMHhmZmZmZmZm/Zi1uby1yai1tbw"
        );

        /*Actor lil*/
        chars[1] = new Actor(
                "Lily Aldrin", 208,
                "https://m.media-amazon.com/images/M/MV5BMTkxODc5ODI5OV5BMl5BanBnXkFtZTcwNzExOTUyNw@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor rob*/
        chars[2] = new Actor(
                "Robin Scherbatsky", 208,
                "https://m.media-amazon.com/images/M/MV5BN2ViYjA1NzAtMTU0NS00NTc4LThmNGItZDJlNzY4YjQ2OWMwXkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor mar*/
        chars[3] = new Actor(
                "Marshall Eriksen", 208,
                "https://m.media-amazon.com/images/M/MV5BMTUwNzcxNzM1Nl5BMl5BanBnXkFtZTgwNzA5NzU4MjE@._V1_UY44_CR0,0,32,44_AL_.jpg"
        );

        /*Actor ted*/
        chars[4] = new Actor(
                "Ted Mosby", 208,
                "https://m.media-amazon.com/images/M/MV5BMjAwNTUxMTM4OF5BMl5BanBnXkFtZTcwNjUyNzc4Mg@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor dau*/
        chars[5] = new Actor(
                "Daughter", 63,
                "https://m.media-amazon.com/images/M/MV5BMTQzOTQ0NTI2NF5BMl5BanBnXkFtZTgwMjIxMDA3MTE@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor son*/
        chars[6] = new Actor(
                "Son", 63,
                "https://m.media-amazon.com/images/M/MV5BMTg0ODQxNGMtNDFmMi00ZmUzLTkzMzMtNDRkZWZkYTJkOGQxXkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_UY44_CR2,0,32,44_AL_.jpg"
        );

        /*Actor mom*/
        chars[7] = new Actor(
                "Tracy McConnell", 25,
                "https://imgs.search.brave.com/Qc1Urui5vDKJJm3MAURzf0L4t6Dbvb1-SOVQJ9mXiy0/rs:fit:400:400:1/g:ce/aHR0cHM6Ly82OC5t/ZWRpYS50dW1ibHIu/Y29tLzExYWQ5MDRj/NTVjNjc5M2JiYTRk/YmZjZWExOWYyM2Vi/L3R1bWJscl9vcGpm/bnd6N0FqMXFqeXJp/OG8zXzQwMC5qcGc"
        );

        /*Actor ran*/
        chars[8] = new Actor(
                "Ranjit", 21,
                "https://imgs.search.brave.com/oxsENDpr84VlYMkUk_1hLkrd557tBp-fBnEmnTPphzk/rs:fit:200:200:1/g:ce/aHR0cDovL2ltZy5z/aGFyZXR2LmNvbS9z/aG93cy9jaGFyYWN0/ZXJzL3RodW1ibmFp/bHMvaG93X2lfbWV0/X3lvdXJfbW90aGVy/LnJhbmppdC5qcGc"
        );

        /*Actor car*/
        chars[9] = new Actor(
                "Carl the Bartender", 19,
                "https://imgs.search.brave.com/ZhkjZg01MzpksOg8lAlU0LUL5f-2WuL_GiBqlnp8Pgg/rs:fit:304:324:1/g:ce/aHR0cHM6Ly9zdGF0/aWMudHZ0cm9wZXMu/b3JnL3Btd2lraS9w/dWIvaW1hZ2VzL2hp/bXltLWNhcmxfNzQ5/OC5qcGc"
        );

        /*Actor wen*/
        chars[10] = new Actor(
                "Wendy the Waitress", 17,
                "https://imgs.search.brave.com/PLq7Fqs-yUr9dsmdAkY_xnZSqkcvQfoxO799RYoGWXE/rs:fit:275:353:1/g:ce/aHR0cDovL2ltYWdl/czMud2lraWEubm9j/b29raWUubmV0L19f/Y2IyMDEwMTEwNzIw/MTc1Ny9oaW15bS9p/bWFnZXMvMi8yZC9X/ZW5keS5wbmc"
        );

        /*Actor vic*/
        chars[11] = new Actor(
                "Victoria", 15,
                "https://imgs.search.brave.com/O_apU-82EM-sewFcOM_OEdNi0SlGXj7PJp-rTH5VzdU/rs:fit:500:375:1/g:ce/aHR0cHM6Ly9leHRl/cm5hbC1wcmV2aWV3/LnJlZGQuaXQvOEEt/bi1vOGlxUHk5dURp/N05hdnoyQTlUVXdW/VHRhbWhpMGxteVNy/aUVwby5wbmc_d2lk/dGg9NTAwJmF1dG89/d2VicCZzPTRhMjE1/YjA2NWVlYzRiYTlm/ODRlMWE1NmIwMjQ3/OTRlMjM2MzE5ODM"
        );

        /*Actor jud*/
        chars[12] = new Actor(
                "Judy Eriksen", 15,
                "https://imgs.search.brave.com/GGbLZUmR_erUT6rOIL8QmpqhxqGDgXLxIoXG17T8f88/rs:fit:267:317:1/g:ce/aHR0cHM6Ly9zdGF0/aWMudHZ0cm9wZXMu/b3JnL3Btd2lraS9w/dWIvaW1hZ2VzL2hp/bXltLWp1ZHlfNDUz/Ni5wbmc"
        );

        /*Actor zoe*/
        chars[13] = new Actor(
                "Zoe", 13,
                "https://imgs.search.brave.com/dZBOJxln7-BbDelvaPKN6-180t6BZTP8__Mhwe7zxLw/rs:fit:470:674:1/g:ce/aHR0cDovL2ltYWdl/czEud2lraWEubm9j/b29raWUubmV0L19f/Y2IyMDEyMDgxMzAz/MjQ0MC9oaW15bS9p/bWFnZXMvMi8yMC9a/b2V5LmpwZw"
        );

        /*Actor jam*/
        chars[14] = new Actor(
                "James", 14,
                "https://m.media-amazon.com/images/M/MV5BMTU0MzM1NjEyMl5BMl5BanBnXkFtZTcwMjExMDM2NQ@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor mas*/
        chars[15] = new Actor(
                "Marvin Sr", 12,
                "https://m.media-amazon.com/images/M/MV5BMTc3ODcxOTU3N15BMl5BanBnXkFtZTcwOTI2NTQwOA@@._V1_UY44_CR1,0,32,44_AL_.jpg"
        );

        /*Actor pat*/
        chars[16] = new Actor(
                "Patrice", 12,
                "https://m.media-amazon.com/images/M/MV5BYWQxNTlmNmUtODA5Ni00MDJiLTk3ZDEtM2I1MzQ5YjU1NWI4XkEyXkFqcGdeQXVyOTA0MTA4Ng@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor mic*/
        chars[17] = new Actor(
                "Mickey", 11,
                "https://m.media-amazon.com/images/M/MV5BMTM2NDY3MDcwNl5BMl5BanBnXkFtZTYwMjgxNDA2._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor lin*/
        chars[18] = new Actor(
                "Linus", 11,
                "https://m.media-amazon.com/images/M/MV5BODRmOWRlMzQtZDgxOS00ZjEwLWFmNDAtN2Y0MmFlYjVkNDAzXkEyXkFqcGdeQXVyMjUwMDU2MDk@._V1_UY44_CR0,0,32,44_AL_.jpg"
        );

        /*Actor qui*/
        chars[19] = new Actor(
                "Quinn", 10,
                "https://m.media-amazon.com/images/M/MV5BMjAzNzY2NzM2NV5BMl5BanBnXkFtZTcwNDcwMzI5Mg@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /* Actor ste*/
        chars[20] = new Actor(
                "Stella", 10,
                "https://m.media-amazon.com/images/M/MV5BMjQyNjg4NDI4NV5BMl5BanBnXkFtZTcwOTAzOTUxMg@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor kev*/
        chars[21] = new Actor(
                "Kevin", 10,
                "https://m.media-amazon.com/images/M/MV5BMTQ4NjM4NzczNF5BMl5BanBnXkFtZTcwNDc2NjAwNw@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor riv*/
        chars[22] = new Actor(
                "Sandy Rivers", 10,
                "https://m.media-amazon.com/images/M/MV5BMTcyMTg3MDU2NV5BMl5BanBnXkFtZTcwNjk0NTM2OQ@@._V1_UY44_CR14,0,32,44_AL_.jpg"
        );

        /*Actor nor*/
        chars[23] = new Actor(
                "Nora", 10,
                "https://imgs.search.brave.com/z1k7cShZyuf7ja9NI9bTnccfoFWm3q3MLdYB0OFaQBM/rs:fit:318:352:1/g:ce/aHR0cDovL2ltZzQu/d2lraWEubm9jb29r/aWUubmV0L19fY2Iy/MDEzMDEyMDA4MzM0/NS9sb3ZlaW50ZXJl/c3QvaW1hZ2VzLzIv/MjAvSG93LWktbWV0/LXlvdXItbW90aGVy/LTZ4MTYtbm9yYS1j/YXAtMTIucG5n"
        );

        /*Actor mik*/
        chars[24] = new Actor(
                "Mike", 10,
                "https://imgs.search.brave.com/m3tCpuMF7RQKi2l_MkgSEH0NjVcQZxh-4uLNfOV9CWk/rs:fit:960:540:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/LzAvMDMvTWlrZS5w/bmcvcmV2aXNpb24v/bGF0ZXN0P2NiPTIw/MTAxMTE3MDk0OTEw"
        );

        /*Actor lor*/
        chars[25] = new Actor(
                "Loretta", 9,
                "https://m.media-amazon.com/images/M/MV5BMTM4OTIzMTg5MF5BMl5BanBnXkFtZTYwNjA5OTIz._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor dap*/
        chars[26] = new Actor(
                "Daphne", 8,
                "https://m.media-amazon.com/images/M/MV5BMTI1OTA0MTcyNl5BMl5BanBnXkFtZTYwMTY3NTc3._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor art*/
        chars[27] = new Actor(
                "Arthur Hobbs", 8,
                "https://m.media-amazon.com/images/M/MV5BOWM5MDJjYTItMTRkNC00NTQ4LThkNjUtNDY3Mzk0YWMwMTBhXkEyXkFqcGdeQXVyNzQzNDYwMA@@._V1_UY44_CR1,0,32,44_AL_.jpg"
        );

        /*Actor cap*/
        chars[28] = new Actor(
                "The Captain", 7,
                "https://imgs.search.brave.com/SYUsimWciyzzZ_R6trks5-mjXIxtr0cqNvCCzqUAGtQ/rs:fit:220:308:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZTMud2lraWEu/bm9jb29raWUubmV0/L2hvdy1pLW1ldC15/b3VyLW1vdGhlci9p/bWFnZXMvOS85Ny9U/aGVfY2FwdGFpbl9l/bmxhcmdlZC5wbmcv/cmV2aXNpb24vbGF0/ZXN0P2NiPTIwMTEw/OTI3MTg1NDExJnBh/dGgtcHJlZml4PWRl"
        );

        /*Actor bra*/
        chars[29] = new Actor(
                "Brad", 7,
                "https://m.media-amazon.com/images/M/MV5BMjI3NTkyMDYyOF5BMl5BanBnXkFtZTgwNjkyNzc4OTE@._V1_UY44_CR0,0,32,44_AL_.jpg"
        );

        /*Actor nic*/
        chars[30] = new Actor(
                "Nick", 7,
                "https://m.media-amazon.com/images/M/MV5BYzA1NDk4NDktMWYwYy00MjQzLTg0ZDAtMWJhY2UyNmI5YTEwXkEyXkFqcGdeQXVyNjA4NjQwNw@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor stu*/
        chars[31] = new Actor(
                "Stuart", 7,
                "https://imgs.search.brave.com/RpG02Mr0R93Cwnj-mDy3PiiXNNAJCFgJSm6_ThwOU4A/rs:fit:224:295:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/LzIvMmIvU3R1YXJ0/LnBuZy9yZXZpc2lv/bi9sYXRlc3Q_Y2I9/MjAxMDEyMTkwMzM3/MDQ"
        );

        /*Actor vir*/
        chars[32] = new Actor(
                "Virginia Mosby", 7,
                "https://imgs.search.brave.com/oIjDMHD2pJzRn4n8jmUDHkkZlX2OvZeK5hCwGnjc3og/rs:fit:196:281:1/g:ce/aHR0cHM6Ly9zdGF0/aWMudHZ0cm9wZXMu/b3JnL3Btd2lraS9w/dWIvaW1hZ2VzL2hp/bXltLXZpcmdpbmlh/XzI2MDYucG5n"

        );

        /*Actor sco*/
        chars[33] = new Actor(
                "Scooter", 7,
                "https://imgs.search.brave.com/hlLrEqaivFOBP67nqi4m9LU8Gez1zzofSRWCj0SlwIg/rs:fit:304:330:1/g:ce/aHR0cDovL2ltZzEu/d2lraWEubm9jb29r/aWUubmV0L19fY2Iy/MDEwMTEyNDIyNDQz/Mi9oaW15bS9pbWFn/ZXMvYS9hYy9TY29v/dGVyLnBuZw"
        );

        /*Actor zab*/
        chars[34] = new Actor(
                "Billy Zabka", 7,
                "https://m.media-amazon.com/images/M/MV5BMzlkODQ0ODMtYmQ5NS00MWZhLTlkMjAtYTMwYzg5MjNkNmFmXkEyXkFqcGdeQXVyMjUwNzgxNjk@._V1_UY44_CR2,0,32,44_AL_.jpg"
        );

        /*Actor blu*/
        chars[35] = new Actor(
                "Blauman", 6,
                "https://imgs.search.brave.com/7K_gTtnU-gona0gfxc1OW0gY_7FDlnVyrRW1FB0DEyw/rs:fit:205:215:1/g:ce/aHR0cDovL2ltZzIu/d2lraWEubm9jb29r/aWUubmV0L19fY2Iy/MDEwMTExMTIzMTIz/NC9oaW15bS9pbWFn/ZXMvYi9iNy9CbGF1/bWFuLnBuZw"
        );

        /*Actor don*/
        chars[36] = new Actor(
                "Don", 6,
                "https://m.media-amazon.com/images/M/MV5BZjI4MTE0ZGEtNmQ2MC00NWVhLWEyZTgtYjgyMjQ1NDQwZmFhXkEyXkFqcGdeQXVyMTEwODg2MDY@._V1_UY44_CR23,0,32,44_AL_.jpg"
        );

        /*Actor bil*/
        chars[37] = new Actor(
                "Bilson", 6,
                "https://m.media-amazon.com/images/M/MV5BMjA4NDU2ODM4MV5BMl5BanBnXkFtZTcwOTc2ODE3Mw@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor rod*/
        chars[38] = new Actor(
                "Robin Sr", 6,
                "https://m.media-amazon.com/images/M/MV5BMTYzNTg0NDU5NF5BMl5BanBnXkFtZTcwNDQ5NTk3MQ@@._V1_UY44_CR1,0,32,44_AL_.jpg"
        );

        /*Actor maj*/
        chars[39] = new Actor(
                "Marvin Jr", 6,
                "https://imgs.search.brave.com/ScKucN053tTjo3xF_dH7yOTNYxlx3PEHwzc2LR3VA6U/rs:fit:257:308:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/LzkvOTkvTWFydmlu/X0VyaWtzZW5fSnIu/cG5nL3JldmlzaW9u/L2xhdGVzdD9jYj0y/MDExMTAwMTEyMzIz/OA"
        );

        /*Actor ala*/
        chars[40] = new Actor(
                "Alan Thicke", 5,
                "https://m.media-amazon.com/images/M/MV5BMTIxOTU2OTg4M15BMl5BanBnXkFtZTYwMjk1ODc0._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor bec*/
        chars[41] = new Actor(
                "Boats Boats Boats!", 5,
                "https://m.media-amazon.com/images/M/MV5BNjI3NDI3MjU4NV5BMl5BanBnXkFtZTcwMTc1MDc1Mw@@._V1_UY44_CR0,0,32,44_AL_.jpg"
        );

        /*Actor jea*/
        chars[42] = new Actor(
                "Jeanette", 5,
                "https://m.media-amazon.com/images/M/MV5BMTA5Mzg4MzU2MTdeQTJeQWpwZ15BbWU4MDM3MzIxNjQz._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor cla*/
        chars[43] = new Actor(
                "Claudia", 5,
                "https://imgs.search.brave.com/rOriEQCMfLvtLIbFohevkat8wS5fxp-y_bBJSnqmfLM/rs:fit:227:309:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/LzMvMzQvQ2xhdWRp/YS5wbmcvcmV2aXNp/b24vbGF0ZXN0P2Ni/PTIwMTAxMjE5MDM0/MzM4"
        );

        /*Actor luc*/
        chars[44] = new Actor(
                "Lucy / Robin's sister", 5,
                "https://imgs.search.brave.com/hYzl1R4i16Zf4ox_xB0teKPbAg78FaPKQp5PjqMBMXQ/rs:fit:400:400:1/g:ce/aHR0cHM6Ly82Ni5t/ZWRpYS50dW1ibHIu/Y29tL2QyMmYyNWE1/MmQ0OWJiYzI0NmUy/NTExOGE2NWMyOTNi/L3R1bWJscl9vdTQ0/eHVyU2IxMXR6amIz/eW8xXzQwMC5wbmc"
        );

        /*Actor cur*/
        chars[45] = new Actor(
                "Curtis", 5,
                "https://m.media-amazon.com/images/M/MV5BMmVmMjU3ZGUtZjI0Yy00MjM4LTg2ZTgtYTcwNzFkMDI1YmQ1XkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor gun*/
        chars[46] = new Actor(
                "Tim Gunn", 4,
                "https://m.media-amazon.com/images/M/MV5BMTc5NTA5Njg0NF5BMl5BanBnXkFtZTcwMTY3ODQ1MQ@@._V1_UY44_CR1,0,32,44_AL_.jpg"
        );

        /*Actor cin*/
        chars[47] = new Actor(
                "Cindy", 4,
                "https://m.media-amazon.com/images/M/MV5BMTM2NjUxNzgxMV5BMl5BanBnXkFtZTcwNTc1Mjc1MQ@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor pun*/
        chars[48] = new Actor(
                "Punchy", 4,
                "https://imgs.search.brave.com/onvkB1X4c3ScpSqZmSX8ywBtrazKWFcthjlvPNC7nNU/rs:fit:217:250:1/g:ce/aHR0cHM6Ly9zdGF0/aWMudHZ0cm9wZXMu/b3JnL3Btd2lraS9w/dWIvaW1hZ2VzL2hp/bXltLXB1bmNoeV84/ODU4LnBuZw"
        );

        /*Actor sam*/
        chars[49] = new Actor(
                "Sam Gibbs", 4,
                "https://m.media-amazon.com/images/M/MV5BMTk5NjMwNzA5MF5BMl5BanBnXkFtZTYwNTI0Mjky._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor jer*/
        chars[50] = new Actor(
                "Crazy Jerry", 4,
                "https://static.wikia.nocookie.net/himym/images/0/07/Jerome.png/revision/latest/scale-to-width-down/210?cb=20120719024209"
        );

        /*Actor meg*/
        chars[51] = new Actor(
                "Crazy Meg", 4,
                "https://imgs.search.brave.com/Y7kkvxrPI-OAaibOPcSCeOqbVsAw25GXC_qkPy2-1YE/rs:fit:578:557:1/g:ce/aHR0cDovL3ZpZ25l/dHRlMi53aWtpYS5u/b2Nvb2tpZS5uZXQv/aG93LWktbWV0LXlv/dXItbW90aGVyL2lt/YWdlcy82LzZlL01l/Zy5wbmcvcmV2aXNp/b24vbGF0ZXN0P2Ni/PTIwMTExMDA0MTgx/MTEyJnBhdGgtcHJl/Zml4PWRl"
        );

        /*Actor yut*/
        chars[52] = new Actor(
                "Yuthers", 4,
                "https://m.media-amazon.com/images/M/MV5BMTc1NzY4OTIyMF5BMl5BanBnXkFtZTgwNDI2Mjk0MjE@._V1_UY44_CR13,0,32,44_AL_.jpg"
        );

        /*Actor bet*/
        chars[53] = new Actor(
                "Betty", 4,
                "https://m.media-amazon.com/images/M/MV5BYjVmODE5N2ItMzI0YS00OTBhLThhMGMtYTNiOTcyNzI2MzliXkEyXkFqcGdeQXVyMjQwMDg0Ng@@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor sha*/
        chars[54] = new Actor(
                "Shannon", 4,
                "https://m.media-amazon.com/images/M/MV5BYjY4MDZkMGEtMTk4Mi00N2RhLWFjZDUtZWNlMzhlNWE0MGU4XkEyXkFqcGdeQXVyMTUyMDAyNTI@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor kar*/
        chars[55] = new Actor(
                "Karen", 3,
                "https://m.media-amazon.com/images/M/MV5BMTA4MzEzMzIyOTdeQTJeQWpwZ15BbWU4MDA2ODAzMjIx._V1_SY100_CR16,0,100,100_AL_.jpg"
        );

        /*Actor coo*/
        chars[56] = new Actor(
                "The Man, the Myth, The Legendary Mitch", 2,
                "https://static.wikia.nocookie.net/himym/images/7/79/Mitch.jpg/revision/latest/scale-to-width-down/210?cb=20220725195027"
        );

        /*Actor wal*/
        chars[57] = new Actor(
                "Hammond Druthers", 3,
                "https://m.media-amazon.com/images/M/MV5BMTA2NjEyMTY4MTVeQTJeQWpwZ15BbWU3MDQ5NDAzNDc@._V1_UX32_CR0,0,32,44_AL_.jpg"
        );

        /*Actor gra*/
        chars[58] = new Actor(
                "Grandma Lois", 3,
                "https://imgs.search.brave.com/6MWJzV493k3kr3rQ0juHhMWGCmKwrMjSXFffvggUm7U/rs:fit:284:336:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZTQud2lraWEu/bm9jb29raWUubmV0/L2hpbXltL2ltYWdl/cy82LzY5L0dyYW5k/bWFfTG9pcy5qcGcv/cmV2aXNpb24vbGF0/ZXN0P2NiPTIwMTIw/NjI3MDUwNDA5"
        );

        /*Actor ton*/
        chars[59] = new Actor(
                "Tony", 3,
                "https://imgs.search.brave.com/faTFuSgmK5czfgt9av6vesMZPZhu8vCl4QcyeLhsDrA/rs:fit:680:907:1/g:ce/aHR0cDovL2kxLmt5/bS1jZG4uY29tL3Bo/b3Rvcy9pbWFnZXMv/bmV3c2ZlZWQvMDAw/LzczNy8zOTUvNGU5/LmpwZw"
        );

        /*Actor cli*/
        chars[60] = new Actor(
                "Clint", 3,
                "https://m.media-amazon.com/images/M/MV5BMTgzMTQ3NzYxNV5BMl5BanBnXkFtZTgwNTk5MDMyMjE@._V1_SY100_CR16,0,100,100_AL_.jpg"
        );

        /*Actor jim*/
        chars[61] = new Actor(
                "Jim Nantz", 3,
                "https://imgs.search.brave.com/CtlXnJ6_oSwRJf5D7_23NWxSs2QDLxj1IJuYv6ijLtU/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly9taXJv/Lm1lZGl1bS5jb20v/bWF4LzUxODQvMSpD/U1FuTUhIdEJRQUY1/bjh3WDJ1NlBnLmpw/ZWc"
        );

        /*Actor drs*/
        chars[62] = new Actor(
                "Dr Sonya", 3,
                "https://imgs.search.brave.com/XyesXgNPNhOB5ZwEgKd35BOm_k38T2AUrgobXkQpauc/rs:fit:310:413:1/g:ce/aHR0cHM6Ly9jcHMt/c3RhdGljLnJvdmlj/b3JwLmNvbS8yL09w/ZW4vR2V0dHkvMTU0/Mjg5L19kZXJpdmVk/X2pwZ19xOTBfMzEw/eDQ3MF9tMC8xMzkz/MjkzMzkuanBn"
        );

        /*Actor mat*/
        chars[63] = new Actor(
                "Mrs Matsen", 3,
                "https://imgs.search.brave.com/urg_5PSlJ0BO3Q_gE6rs7VMbo1orq06Kl7e3y_JpXTg/rs:fit:337:352:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/LzAvMDkvTXJzLl9N/YXRzZW4uanBnL3Jl/dmlzaW9uL2xhdGVz/dD9jYj0yMDEyMDYy/MzA1MzI1OA"
        );

        /*Actor gen*/
        chars[64] = new Actor(
                "Robin's Mother", 3,
                "https://imgs.search.brave.com/baiZmvFbfB24h2LsXRoCK7xXkwuAl12yzb9mf5dhP_M/rs:fit:618:348:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aG93LWktbWV0LXlv/dXItbW90aGVyL2lt/YWdlcy9hL2FjL1Vz/dHYtaG93LWktbWV0/LXlvdXItbW90aGVy/LXZlc3V2aXVzLTMu/anBnL3JldmlzaW9u/L2xhdGVzdD9jYj0y/MDE0MDgwNjE5MTIw/MiZwYXRoLXByZWZp/eD1kZQ"
        );

        /*Actor ann*/
        chars[65] = new Actor(
                "Anna", 3,
                "https://imgs.search.brave.com/E3yVYDb4oPgbnslwB0QM_T-aWOzE5iASWYOwqo7mKL8/rs:fit:223:345:1/g:ce/aHR0cDovL3ZpZ25l/dHRlMS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/L2QvZDYvQW5uYSUy/Q3RoZWJyYWNrZXQu/cG5nL3JldmlzaW9u/L2xhdGVzdD9jYj0y/MDExMDIxNDAyMzY1/NQ"
        );


        /*Actor lou*/
        chars[66] = new Actor(
                "Louis", 3,
                "https://imgs.search.brave.com/wRXS3YeXkdrJplx5y3GlSX5X7wTt_jL49ZS0IVTMVi8/rs:fit:370:450:1/g:ce/aHR0cDovLzEuYnAu/YmxvZ3Nwb3QuY29t/Ly05NnlnLW12MG5R/TS9VdWZuTE1rWHNu/SS9BQUFBQUFBQTI2/Zy9jSUlWOWo2UmtD/cy9zMTYwMC9ISU1Z/TS1sb3UtZmVycmln/bm8tbG91aXMuanBn"
        );

        /*Actor alf*/
        chars[67] = new Actor(
                "Alfred Mosby", 3,
                "https://imgs.search.brave.com/YvHjbTq7UyCT3tDZbWQqZULBIzc1JG9o6ZZ1ln2orVI/rs:fit:183:239:1/g:ce/aHR0cDovL2ltZzIu/d2lraWEubm9jb29r/aWUubmV0L19fY2Iy/MDEwMTIxNjIxMTEx/MS9oaW15bS9pbWFn/ZXMvOC84YS9BbGZy/ZWRfTW9zYnkucG5n"
        );

        /*Actor pum*/
        chars[68] = new Actor(
                "Pumpkin", 2,
                "https://imgs.search.brave.com/EexWit5kOUbPNJicFxYhCaHgAdW0bhALguKH4Q1XQgQ/rs:fit:553:434:1/g:ce/aHR0cHM6Ly9pbWcu/aHVmZmluZ3RvbnBv/c3QuY29tL2Fzc2V0/LzViYjNkOGExMjYw/MDAwMzYwMDgyMmU3/MC5qcGVnP29wcz1z/Y2FsZWZpdF83MjBf/bm91cHNjYWxl"
        );

        /*Actor tru*/
        chars[69] = new Actor(
                "Trudy", 2,
                "https://m.media-amazon.com/images/M/MV5BYTcyOWU2YjYtZDJiYi00MTA4LWJjNWItZGM0N2RjODRjYTcwXkEyXkFqcGdeQXVyMjg2MTMyNTM@._V1_SX100_CR0,0,100,100_AL_.jpg"
        );

        /*Actor aby*/
        chars[70] = new Actor(
                "Abby", 2,
                "https://imgs.search.brave.com/kUQSKsAK-5hCHIgTuV1uAyWJKhMjExjUIGjQvXMkZ8E/rs:fit:1200:675:1/g:ce/aHR0cHM6Ly92aWdu/ZXR0ZS53aWtpYS5u/b2Nvb2tpZS5uZXQv/aG93LWktbWV0LXlv/dXItbW90aGVyL2lt/YWdlcy85LzliL0Fi/YnktaG93LWktbWV0/LXlvdXItbW90aGVy/LTI4MTcyMTYtMTIw/MC02NzUuanBnL3Jl/dmlzaW9uL2xhdGVz/dD9jYj0yMDExMDYx/MjE3MDA0MiZwYXRo/LXByZWZpeD1kZQ"
        );

        /*Actor ale*/
        chars[71] = new Actor(
                "Alex Trebek", 2,
                "https://imgs.search.brave.com/12mvF_2HGQkpjNugZEGMKA5TXMvquS0NSHrb89bn0us/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly9jZG4u/YW1vbWFtYS5jb20v/ZWZkYjYxNDdjOTRk/YzQ2ZmRlMGIyMzgw/MjAwNmY0YTAzNTU4/MTkxNTcwNzEwNTE0/LmpwZz93aWR0aD0x/MzY1JmhlaWdodD0y/MDQ4"
        );

        /*Actor dar*/
        chars[72] = new Actor(
                "Darren", 2,
                "https://imgs.search.brave.com/UQdNPyKgciVDs0WgIeQn_J97qRSGVJNkUsROE6c7HOU/rs:fit:276:182:1/g:ce/aHR0cHM6Ly9pLnJl/ZGQuaXQvbnJueW95/Z3ptdXcwMS5qcGc"
        );

        /*Actor jed*/
        chars[73] = new Actor(
                "Jed Mosley", 2,
                "https://imgs.search.brave.com/2CKGHIQjsnaCvWJYD24jzkqa3P_NHjyjGmQMkviJBCo/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly9wYnMu/dHdpbWcuY29tL3By/b2ZpbGVfaW1hZ2Vz/LzQyNTE0ODQ4NTg2/MDQ2MjU5Mi9aTk1T/d1BrMy5qcGVn"
        );

        /*Actor kai*/
        chars[74] = new Actor(
                "Karina", 2,
                "https://imgs.search.brave.com/CmnyQ4ktP4mrWfZB1rVrbNqobZoSm8VOWY7LWyi-3_4/rs:fit:1200:720:1/g:ce/aHR0cDovL3ZpZ25l/dHRlMy53aWtpYS5u/b2Nvb2tpZS5uZXQv/aG93LWktbWV0LXlv/dXItbW90aGVyL2lt/YWdlcy9lL2VhL1Zs/Y3NuYXAtMjAxMi0w/NS0yNy0yMWgzMm0w/MXMxNDUucG5nL3Jl/dmlzaW9uL2xhdGVz/dD9jYj0yMDE0MDIw/NjE5NTEzNiZwYXRo/LXByZWZpeD1kZQ"
        );

        /*Actor bli*/
        chars[75] = new Actor(
                "The Blitz", 2,
                "https://imgs.search.brave.com/dotclRiumlqxSgryzezTDgEfrAkjgFyV5SFSvFX0md4/rs:fit:1200:1200:1/g:ce/aHR0cHM6Ly9yZWxh/dGlvbnNoaXBkYi5j/b20vd3AtY29udGVu/dC91cGxvYWRzLzIw/MTkvMDYvam9yZ2Ut/Z2FyY2lhXzIzNzUw/Ny5qcGVn"
        );

        /*Actor bla*/
        chars[76] = new Actor(
                "Blah Blah", 2,
                "https://imgs.search.brave.com/6WS-_DTE33oFPUjVH6_DJGW2Z-4oXwjEIG103QGoEek/rs:fit:302:377:1/g:ce/aHR0cDovL2ltZzMu/d2lraWEubm9jb29r/aWUubmV0L19fY2Iy/MDEwMTAwODAxNDU1/MC9oaW15bS9pbWFn/ZXMvYi9iNy9CbGFo/X2JsYWguanBn"
        );

        /*Actor jlo*/
        chars[77] = new Actor(
                "Anita", 1,
                "https://imgs.search.brave.com/biIfjPW5eeOIkKkzg8crw8pCU6f2VmYEjXLOXI7hQlk/rs:fit:1080:1080:1/g:ce/aHR0cHM6Ly9ha25z/LWltYWdlcy5lb25s/aW5lLmNvbS9lb2xf/aW1hZ2VzL0VudGly/ZV9TaXRlLzIwMjA4/MjkvcnNfMTIwMHgx/MjAwLTIwMDkyOTE0/MzgyNy1qZW5uaWZl/cmxvcGV6Mi5qcGc_/Zml0PWFyb3VuZCU3/QzEwODA6MTA4MCZv/dXRwdXQtcXVhbGl0/eT05MCZjcm9wPTEw/ODA6MTA4MDtjZW50/ZXIsdG9w"
        );

        /*Actor clo*/
        chars[78] = new Actor(
                "Chloe", 1,
                "https://imgs.search.brave.com/8kwtvDgFRHFvzlTFexSmtmRrpIpHG41_T7OzjV7alvg/rs:fit:1200:900:1/g:ce/aHR0cHM6Ly9pLmlu/c2lkZXIuY29tLzVi/YTE2YzJiZjc4Nzc2/MGIwODhiNDU2OT9h/dXRvPXdlYnAmZW5h/YmxlPXVwc2NhbGUm/Zml0PWNyb3AmaGVp/Z2h0PTkwMCZvcHRp/bWl6ZT1tZWRpdW0m/d2lkdGg9MTIwMA"
        );

        /*Actor bob*/
        chars[79] = new Actor(
                "Bob Barker", 1,
                "https://imgs.search.brave.com/Um9yS53YCTu_dD-CDMUj7qARzoMfE2WYROYAHkFOVkM/rs:fit:634:897:1/g:ce/aHR0cHM6Ly9pLmRh/aWx5bWFpbC5jby51/ay8xcy8yMDE4LzEw/LzIzLzA2LzUzMDI3/ODgtNjMwNTE3NS1S/dXNoZWRfQm9iX0Jh/cmtlcl85NF93YXNf/cnVzaGVkX3RvX3Ro/ZV9ob3NwaXRhbF9p/bl9Mb3NfQW5nZWxl/c19vLWEtMl8xNTQw/MjcyNjIyNTYzLmpw/Zw"
        );

        /*Actor reg*/
        chars[80] = new Actor(
                "Honey", 1,
                "https://imgs.search.brave.com/G5ZyG_rZUpxljVl0PVng_hZJih-E3OpROwvYMIGHC80/rs:fit:624:352:1/g:ce/aHR0cDovLzQuYnAu/YmxvZ3Nwb3QuY29t/L182UzlfcmJCRVFC/MC9UVkZBS3k2b2Jz/SS9BQUFBQUFBQUFj/SS9nQzRmRkJYQjVU/Zy9zMTYwMC9ob3cu/aS5tZXQueW91ci5t/b3RoZXIuNjE1Lmhk/dHYtbG9sXzAwMDMu/anBn"
        );

        /*Actor tug*/
        chars[81] = new Actor(
                "Tugboat", 4,
                "https://imgs.search.brave.com/aJwiV8KQhWw0LOE8JjXOYjVn-zc0tFjHS_PyRJBClCg/rs:fit:580:431:1/g:ce/aHR0cDovL3ZpZ25l/dHRlMi53aWtpYS5u/b2Nvb2tpZS5uZXQv/aGlteW0vaW1hZ2Vz/L2QvZGIvVHVnYm9h/dExhbmRtYXJrcy5q/cGcvcmV2aXNpb24v/bGF0ZXN0P2NiPTIw/MTExMjExMTIyMjQ3"
        );

        /*Actor pin*/
        chars[82] = new Actor(
                "The Pineapple", 2,
                "https://static.wikia.nocookie.net/himym/images/a/a1/PINEAPPLE_INCIDENT_2.jpg/revision/latest/scale-to-width-down/180?cb=20110618184926"
        );

        /*Actor tur*/
        chars[83] = new Actor(
                "TurTurkeyKey", 1,
                "https://static.wikia.nocookie.net/himym/images/0/04/Turkey.jpg/revision/latest?cb=20120201185734"
        );

        /*Actor bro*/
        chars[84] = new Actor(
                "The Bro Code", 1,
                "https://imgs.search.brave.com/hDDlibNJBcHRi1GxXaf11RNwuJItwdEDUgs2XXQUwsA/rs:fit:1200:1200:1/g:ce/aHR0cDovL2QyOGhn/cHJpOGFtMmlmLmNs/b3VkZnJvbnQubmV0/L2Jvb2tfaW1hZ2Vz/L2N2cjk3ODE0Mzkx/MTAwMDNfOTc4MTQz/OTExMDAwM19oci5q/cGc"
        );

        /*Actor bfh*/
        chars[85] = new Actor(
                "Blue French Horn", 6,
                "https://static.wikia.nocookie.net/himym/images/6/67/BFH.jpg/revision/latest/smart/width/298/height/223?cb=20120203144149"
        );

        /*Actor iba*/
        chars[86] = new Actor(
                "Intervention Banner", 6,
                "https://static.wikia.nocookie.net/himym/images/3/3f/Intervention.png/revision/latest/scale-to-width-down/300?cb=20101008021324"
        );

        /*Actor mpi*/
        chars[87] = new Actor(
                "Marshpillow", 4,
                "https://static.wikia.nocookie.net/himym/images/f/f3/Marshpillow_2.0.jpg/revision/latest/scale-to-width-down/250?cb=20131012142643"
        );

        /*Actor rot*/
        chars[88] = new Actor(
                "The Robot", 5,
                "https://static.wikia.nocookie.net/himym/images/1/1a/The_Robot.png/revision/latest?cb=20111015011618"
        );

        /*Actor red*/
        chars[89] = new Actor(
                "Red Cowboy Boots", 7,
                "https://static.wikia.nocookie.net/himym/images/c/cd/Red_Cowboy_Boots.jpg/revision/latest/scale-to-width-down/170?cb=20121211192327"
        );

        /*Actor pla*/
        chars[90] = new Actor(
                "The Playbook", 6,
                "https://imgs.search.brave.com/qWKM1Z37bQgHOMYMc7VV2gxlUkOo2aqA_QrrrYfuvMQ/rs:fit:600:338:1/g:ce/aHR0cHM6Ly9jZG4z/LndoYXRjdWx0dXJl/LmNvbS9pbWFnZXMv/MjAxNC8wNC9QTGF5/Ym9vay02MDB4MzM4/LmpwZw"
        );

        /*Actor swo*/
        chars[91] = new Actor(
                "The Swords", 2,
                "https://static.wikia.nocookie.net/himym/images/4/43/The_Duel.png/revision/latest/scale-to-width-down/200?cb=20090927150921"
        );

        /*Actor brx*/
        chars[92] = new Actor(
                "Bronx Donnie", 1,
                "https://i.imgur.com/66RuM1F.png"
        );

        /*Actor cpt*/
        chars[93] = new Actor(
                "Captain Bill", 1,
                "https://i.imgur.com/gRLI0lC.png"
        );

        /*Actor pjb*/
        chars[94] = new Actor(
                "Pickle Jar Bob", 1,
                "https://i.imgur.com/3wbqzpj.png"
        );

        /*Actor sil*/
        chars[95] = new Actor(
                "Staten Island Lou", 1,
                "https://i.imgur.com/WioxUxx.png"
        );

        /*Actor tux*/
        chars[96] = new Actor(
                "Tuxedo Charlie", 1,
                "https://i.imgur.com/xopgVCp.png"
        );

        /*Actor sto*/
        chars[97] = new Actor(
                "Barney's Stormtrooper", 12,
                "https://imgs.search.brave.com/ehtOGvWzQa2EL2XWGm04bYY66CsYmkAWBEgqHWKs7pc/rs:fit:835:650:1/g:ce/aHR0cHM6Ly93d3cu/ZnJvbXRoZW1vdmll/LmNvbS93cC1jb250/ZW50L3VwbG9hZHMv/MjAxNi8xMi9TdGFy/LVdhcnMtU3Rvcm10/cm9vcGVyLUJhcm5l/eS1TdGluc29uLWlu/LUhvdy1JLU1ldC1Z/b3VyLU1vdGhlci5q/cGc"
        );

        /*Actor ptv*/
        chars[98] = new Actor(
                "Barney's 300 inch TV", 2,
                "https://imgs.search.brave.com/3MfdRws2b6q0ABRPfUk-N2vTRSb42XXUgFeK7zXAa9I/rs:fit:624:352:1/g:ce/aHR0cDovL2ltYWdl/czEuZmFucG9wLmNv/bS9pbWFnZXMvaW1h/Z2VfdXBsb2Fkcy9C/YXJuZXktcy1Ib3Vz/ZS1iYXJuZXktc3Rp/bnNvbi04NDA2MThf/NjI0XzM1Mi5qcGc"
        );

        /*Actor gnb*/
        chars[99] = new Actor(
                "T-rex GNB Headquarters", 1,
                "https://imgs.search.brave.com/j1TKsBoQueYBhwMtaZbY4xnLJfMZMeRUO2GOqf_GN4E/rs:fit:530:265:1/g:ce/aHR0cDovL2xpZmV3/aXRob3V0YnVpbGRp/bmdzLm5ldC93b3Jk/cHJlc3Mvd3AtY29u/dGVudC91cGxvYWRz/LzIwMDgvMTEvMDgx/MTE1X2hpbXltLTEu/anBn"
        );

        //If we expand, maybe Missy the goat

        System.out.println("This is a game of Higher or Lower based on How I Met Your Mother, designed by podpah.");
        System.out.println("The point of the game is to guess whether the character you currently have has a higher or lower episode appearance count than the other character presented.");
        System.out.println("To indicate your choice, type higher or lower. If you wish to quit the game at any given time, please type end.");
        System.out.println("Press enter to start.");
        boolean play = true;
        boolean uinput = false;
        Scanner scanner = new Scanner(System.in);
        String sta = scanner.nextLine();
        if (sta.equals("")) {
            //System.out.println("Testing testing");
            //Nothing for now, maybe introduce rounds? Would need to go in loop
        }

        while (play) {

            int randomNum = (int) (Math.random() * 100); // Random number picking thingy
            int randomNum2 = (int) (Math.random() * 100);


            Actor r1 = chars[randomNum];

            while (randomNum2 == randomNum) {
                randomNum2 = (int) (Math.random() * 100);
            }
            ;

            Actor r2 = chars[randomNum2];

            if (lives == 0) {

                System.out.println("The game has finished. You have ended the game with " + uscore + " points.");
                for (int z = 0; z < 3; z++ ) {

                    if (uscore > res[z]) {

                        if (z == 0) {
                            System.out.println("You've beaten the top score! You are now the player with the highest score.");
                            System.out.print("Name the champion:  ");
                            Scanner scan = new Scanner(System.in);
                            String winner = scan.nextLine();
                            app.changeVals(winner,uscore);
                            break;
                        } else if (z == 1) {
                            System.out.println("You've beaten the second highest score. You are now ranked 2nd.");
                            System.out.print("Insert name:  ");
                            Scanner scan = new Scanner(System.in);
                            String winner = scan.nextLine();
                            app.changeVals(winner,uscore);
                            break;
                        } else if (z == 2) {
                            System.out.println("You've beaten the third highest score. You are now ranked 3rd.");
                            System.out.print("Insert name:  ");
                            Scanner scan = new Scanner(System.in);
                            String winner = scan.nextLine();
                            app.changeVals(winner,uscore);
                            break;
                        }
                    }
                }
                System.out.println("High Scores:");
                app.selectAll();
                play = false;
                break;
            }

            System.out.println("Round " + round);
            round++;
            System.out.println(r1.aname + " has shown up in " + r1.episodes + " episodes.");
            System.out.println("The other character is " + r2.aname + ".");
            System.out.print("Do you think " + r1.aname + " has a higher or lower episode count?  ");

            while (!uinput) {

                Scanner scann = new Scanner(System.in);
                String stb = scann.nextLine();

                if (stb.equalsIgnoreCase("higher") || stb.equalsIgnoreCase("h")) {
                    if (r1.episodes > r2.episodes) {
                        ++uscore;
                        System.out.println("You are correct, " + r1.aname + " has appeared in more episodes than " + r2.aname + ". " + r2.aname + " has shown up in " + r2.episodes + " episodes.");
                        System.out.println("That's a difference of " + (Math.abs(r1.episodes - r2.episodes)) + " episodes.");
                        System.out.println("You have been awarded a point");
                    } else if (r1.episodes < r2.episodes) {
                        --lives;
                        System.out.println("Incorrect. " + r1.aname + " has a lower appearance count than " + r2.aname + ". " + r2.aname + " has shown up in " + r2.episodes + " episodes.");
                        System.out.println("That's a difference of " + (Math.abs(r1.episodes - r2.episodes)) + " episodes.");
                        System.out.println("You have lost a life. You currently have " + lives + " lives remaining.");
                    } else {
                        ++uscore;
                        System.out.println("Both " + r1.aname + " and " + r2.aname + " have the same episode count.");
                        System.out.println("This round has been a draw, you have been awarded a point.");
                    }
                    break;
                } else if (stb.equalsIgnoreCase("lower") || stb.equalsIgnoreCase("l")) {
                    if (r1.episodes < r2.episodes) {
                        ++uscore;
                        System.out.println("You are correct, " + r1.aname + " has appeared in less episodes than " + r2.aname + ". " + r2.aname + " has shown up in " + r2.episodes + " episodes.");
                        System.out.println("That's a difference of " + (Math.abs(r1.episodes - r2.episodes)) + " episodes.");
                        System.out.println("You have been awarded a point");
                    } else if (r1.episodes > r2.episodes) {
                        --lives;
                        System.out.println("Incorrect. " + r1.aname + " has a higher appearance count than " + r2.aname + ". " + r2.aname + " has shown up in " + r2.episodes + " episodes.");
                        System.out.println("That's a difference of " + (Math.abs(r1.episodes - r2.episodes)) + " episodes.");
                        System.out.println("You have lost a life. You currently have " + lives + " lives remaining.");
                    } else {
                        ++uscore;
                        System.out.println("Both " + r1.aname + " and " + r2.aname + " have the same episode count.");
                        System.out.println("This round has been a draw, you have been awarded a point.");
                    }
                    break;
                } else if (stb.equalsIgnoreCase("end") || stb.equalsIgnoreCase("e")) {
                    uinput = true;
                    lives = 0;
                } else {
                    System.out.println("Invalid input.");
                }
            }
            System.out.println(" ");
        }

    }

}