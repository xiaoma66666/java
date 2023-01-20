import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        char[][] map = new char[8][10];
        Scanner scanner = new Scanner(System.in);
        int x = 1, y = 1;//玩家坐标
        boolean finish = false;//游戏是否结束
        for (int i = 0; i < map.length; i++) {
            if (i == 0 || i == 7) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = 'H';
                }
            } else {
                map[i][0] = 'H';
                map[i][9] = 'H';
            }
        }
        map[1][3] = 'H';// 地图内墙壁
        map[2][3] = 'H';
        map[3][3] = 'H';
        map[2][5] = 'H';
        map[3][5] = 'H';
        map[3][6] = 'H';
        map[3][8] = 'H';
        map[4][8] = 'H';
        map[6][4] = 'H';
        map[5][4] = 'H';
        map[5][5] = 'H';
        map[5][6] = 'H';
        map[x][y] = '&';// 玩家角色
        map[2][2] = 'o';// 箱子
        map[6][5] = '*';// 目的地

        while (true) {
            //循环游戏
            System.out.println("----------------------------");
            for (char row[] : map) {
                for (char column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();

            }
            System.out.println("----------------------------");
            if (false) {
                break;
            }
            System.out.println("A左移D右移W上移S下移,请输入你的指令:");
            String code = scanner.nextLine();//获取指令
            switch (code.toLowerCase()) {//将指令转换为小写
                case "a":
                    if (map[x][y - 1] == 0) {//如果玩家左边是空位置
                        map[x][y] = 0;//原位置变为空
                        map[x][y - 1] = '&';//玩家移动到新位置
                        y--;//玩家左移
                    } else if (map[x][y - 1] == 'o') {//如果玩家左边是箱子
                        if (map[x][y - 2] != 'H') {//如果箱子左边不是墙
                            if (map[x][y - 2] == '*') {//如果箱子左边是目的地
                                finish = false;//游戏结束
                            } else {
                                map[x][y] = 0;//原位置变为空
                                map[x][y - 1] = '&';//玩家移动到新位置
                                map[x][y - 2] = '*';//箱子移动到新位置
                                y--;//玩家左移
                            }
                        }
                    }
                    break;
                case "d":// 如果输入的是d
                    if (map[x][y + 1] == 0) {// 如果玩家右边是空区
                        map[x][y] = 0;// 原位置变为空区
                        map[x][y + 1] = '&';// 玩家移动到新位置
                        y++;// 玩家坐标右移
                    } else if (map[x][y + 1] == 'o') {// 如果玩家右边是箱子
                        if (map[x][y + 2] != 'H') {// 如果箱子右边不是墙
                            if (map[x][y + 2] == '*') {// 如果箱子右边是目的地
                                finish = true;// 游戏结束
                            }
                            map[x][y] = 0;// 原位置变为空区
                            map[x][y + 1] = '&';// 玩家移动到新位置
                            map[x][y + 2] = 'o';// 箱子移动到新位置
                            y++;// 玩家坐标右移
                        }
                    }
                    break;// 结束判断
                case "w":// 如果输入的是w
                    if (map[x - 1][y] == 0) {// 如果玩家上方是空区
                        map[x][y] = 0;// 原位置变为空区
                        map[x - 1][y] = '&';// 玩家移动到新位置
                        x--;// 玩家坐标上移
                    } else if (map[x - 1][y] == 'o') {// 如果玩家上方是箱子
                        if (map[x - 2][y] != 'H') {// 如果箱子上方不是墙
                            if (map[x - 2][y] == '*') {// 如果箱子上方是目的地
                                finish = true;// 游戏结束
                            }
                            map[x][y] = 0;// 原位置变为空区
                            map[x - 1][y] = '&';// 玩家移动到新位置
                            map[x - 2][y] = 'o';// 箱子移动到新位置
                            x--;// 玩家坐标上移
                        }
                    }
                    break;// 结束判断
                case "s":// 如果输入的是s
                    if (map[x + 1][y] == 0) {// 如果玩家下方是空区
                        map[x][y] = 0;// 原位置变为空区
                        map[x + 1][y] = '&';// 玩家移动到新位置
                        x++;// 玩家坐标下移
                    } else if (map[x + 1][y] == 'o') {// 如果玩家下方是箱子
                        if (map[x + 2][y] != 'H') {// 如果箱子下方不是墙
                            if (map[x + 2][y] == '*') {// 如果箱子下方是目的地
                                finish = true;// 游戏结束
                            }
                            map[x][y] = 0;// 原位置变为空区
                            map[x + 1][y] = '&';// 玩家移动到新位置
                            map[x + 2][y] = 'o';// 箱子移动到新位置
                            x++;// 玩家坐标下移
                        }
                    }
                    break;// 结束判断
                default:// 如果输入的是其他指令
                    System.out.println("您输入的指令有误！");
            }
        }
        scanner.close();
    }
}




