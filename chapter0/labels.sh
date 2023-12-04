for label in $(oc get project -o jsonpath='{.items[0].metadata.labels}' | jq 'keys[]');
do
  value=$(oc get project -o jsonpath='{.items[0].metadata.labels.$label}');
  echo $label"="$value;
done
