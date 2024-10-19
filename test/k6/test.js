import http from "k6/http";

export const options = {
  iterations: 1,
};

export default function () {
  const response = http.get("http://172.171.157.101:8091/producto/");
}
