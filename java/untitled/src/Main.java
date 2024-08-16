import org.json.JSONObject;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder result = new StringBuilder("select * from students where ");
        JSONObject paramsJson = newJSONObject(PARAMS);
        boolean isFirst = true;
        for (String key : paramsJson.keySet()) {
            object value = paramsJson.get(key);
            if (value != null && !value.toString().equals("null")) {
                if (!isFirst) {
                    result.append(" and ");
                } else {
                    isFirst = false;
                }
                result.append(key);
                result.append(" = ");
                if (value instanceof String) {
                    result.append("'");
                    result.append(value);
                    result.append("'");
                } else {
                    result.append(value);
                }
            }
        }
        return QUERY + result.toString();
    }
}
