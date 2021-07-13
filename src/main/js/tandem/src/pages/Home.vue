<template>
  <div class="container">
    Home Sayfası :

    <device type="media" :onchange="update(data)"></device>
    <video autoplay></video>
  </div>
</template>
<script>
export default {
  name: "Home",
  methods: {
    update(stream) {
      document.querySelector("video").src = stream.url;
    },
  },
};
</script>

