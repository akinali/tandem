<template>
  <div class="mb-3">
    <label for="exampleInput" class="form-label">{{ label }}</label>
    <input
      :type="type ? type : 'text'"
      :class="clazz ? clazz : 'form-control'"
      :id=" id ? id : 'form-control'"
      :v-model="value"
    />
  </div>
</template>
<script>
export default {
  name: "InputTandem",
  props: {
    label: String,
    type: String,
    id: String,
    clazz: String,
    'v-model':String
  },
};
</script>