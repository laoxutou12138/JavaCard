package com.xtx.java.day9;

/**
 * @ClassName GameRpg
 * @Description 模拟玩家选择角色
 * @Author UnKnW
 * @Date 2020/10/28 21:20
 **/
public class GameRpg {
    public static void main(String[] args) {
        Player player = new Player();
        String select = "法力角色";
        System.out.println("选择:" + select);
        FightAble f = player.select(select);
        f.specialFight();
        f.commonFight();

        System.out.println("================");
        select = "武力角色";
        System.out.println("选择:" + select);
        FightAble f2 = player.select(select);
        f2.specialFight();
        f2.commonFight();
    }

    static class Player {
        public FightAble select(String str) {
            if ("法力角色".equals(str)) {
                return new Fashi();
            } else if ("武力角色".equals(str)) {
                return new ZhanShi();
            }
            return null;
        }
    }

    static class Fashi implements FightAble {
        @Override
        public void specialFight() {
            System.out.println("法术攻击");
        }
    }

    static class ZhanShi implements FightAble {
        @Override
        public void specialFight() {
            System.out.println("武器攻击");
        }
    }

    interface FightAble {
        public abstract void specialFight();

        public default void commonFight() {
            System.out.println("普通打击");
        }
    }
}
