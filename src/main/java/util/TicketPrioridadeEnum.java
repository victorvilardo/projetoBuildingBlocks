package util;

import java.util.HashMap;
import java.util.Map;

public enum TicketPrioridadeEnum {
    BAIXA(1) {
        @Override
        public String getRetornoValorString() {
            return "1";
        }
    },
    MEDIA(2) {
        @Override
        public String getRetornoValorString() {
            return "2";
        }
    },
    ALTA(3) {
        @Override
        public String getRetornoValorString() {
            return "3";
        }
    };

    public abstract String getRetornoValorString();

    private int status;

    private static Map<Object, Object> map = new HashMap<>();

    TicketPrioridadeEnum(int status) {
        this.status = status;
    }

    static {
        for (TicketPrioridadeEnum enumAcao : TicketPrioridadeEnum.values()) {
            map.put(enumAcao.status, enumAcao);
        }
    }

    public static TicketPrioridadeEnum valueOf(int pageType) {
        return (TicketPrioridadeEnum) map.get(pageType);
    }

    public int getValue() {
        return status;
    }
}
