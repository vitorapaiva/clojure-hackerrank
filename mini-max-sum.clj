

;
; Complete the 'miniMaxSum' function below.
;
; The function accepts INTEGER_ARRAY arr as parameter.
;

(defn miniMaxSum [arr]
 (let [orderedArr (vec (sort arr))
       minSum (reduce + (subvec orderedArr 0 (- (count orderedArr) 1)))
       maxSum (reduce + (subvec orderedArr 1))]
       (println minSum maxSum))
)

(def arr (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #" "))))

(miniMaxSum arr)
