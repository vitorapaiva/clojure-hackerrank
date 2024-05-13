

;
; Complete the 'plusMinus' function below.
;
; The function accepts INTEGER_ARRAY arr as parameter.
;

(defn plusMinus [arr]
    (let [arrSize (count arr)
          zeroNumberCountRatio (double (/ (count (filter (fn [number] (if (= number 0) number)) arr)) arrSize))
          posNumberCountRatio (double (/ (count (filter (fn [number] (if (> number 0) number)) arr)) arrSize))
          negNumberRatio (double (/ (count (filter (fn [number] (if (< number 0) number)) arr)) arrSize))]
          (println posNumberCountRatio)
          (println negNumberRatio)
          (println zeroNumberCountRatio))
)

(def n (Integer/parseInt (clojure.string/trim (read-line))))

(def arr (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #" "))))

(plusMinus arr)
